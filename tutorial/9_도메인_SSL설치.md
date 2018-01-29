# 9. 도메인 구입 및 SSL 인증서 설치

이번 시간엔 무중단 배포 환경을 구축하겠습니다.
(모든 코드는 [Github](https://github.com/jojoldu/springboot-webservice/tree/feature/9)에 있습니다.)  



### Let's Encrypt 설치

Nginx가 설치되었으니 우리 서비스의 보안을 위해 SSL 인증서를 설치하겠습니다. 

> Tip)  
HTTP와 HTTPS에 대한 차이점을 알고싶으신 분들은 [HTTP 프로토콜 - joinc](https://www.joinc.co.kr/w/Site/Network_Programing/AdvancedComm/HTTP#s-5.)를 참고하시거나 가장 추천하는 네트워크 교재인 [그림으로 배우는 HTTP & Network Basic](http://www.kyobobook.co.kr/product/detailViewKor.laf?barcode=9788931447897)를 읽어보시면  좋습니다!

예전에는 비용을 지불해서 유료 인증서를 구입했지만, 최근 오픈소스 인증서인 [Let's Encrypt](https://blog.outsider.ne.kr/1178)가 등장해서 무료로 HTTPS를 사용할수 있게 되었습니다.  
특히 Let's Encrypt 설치 및 업데이트를 쉽게 해주는 certbot이 등장해서 사용하기도 굉장히 수월해졌습니다.  

* [certbox](https://certbot.eff.org/#centosrhel6-nginx)
* [Amazon Linux에서 Certbot의 Let's Encrypt](https://docs.aws.amazon.com/ko_kr/AWSEC2/latest/UserGuide/SSL-on-an-instance.html#letsencrypt)

여기선 Amazon Linux 2017.09 버전의 EC2로 진행됩니다.  
만약 본인의 서버 혹은 EC2의 버전이 다르시다면 위 링크를 참고해서 설치를 진행하셔도 됩니다.  
  
먼저 EC2의 Fedora 프로젝트로부터 EPEL(Extra Packages for Enterprise Linux) 저장소를 활성화합니다. EPEL의 패키지는 Certbot 설치 스크립트를 실행할 때 필요합니다.

```bash
sudo yum-config-manager --enable epel
```

Certbot 최신버전을 다운로드 합니다.

```bash
wget https://dl.eff.org/certbot-auto
```

다운로드가 다 되셨으면 설치 파일에 실행권한을 줍니다.

```bash
chmod a+x certbot-auto
```

sudo로 ```--debug``` 옵션을 주어 설치파일을 실행합니다.

```bash
sudo ./certbot-auto --debug
```

"Is this ok [y/d/N]"가 나오면 "y"를 입력하고 기다립니다.  
"Enter email address (used for urgent renewal and security notices)"가 나오면 Email 주소를 입력하라는 메세지이니, 본인의 Email주소를 입력하시면 됩니다.
"(A)gree/(C)ancel"가 나오면 Let's Encrypt 서비스 계약 조건에 동의여부를 묻는것이니, A를 입력합니다. (동의)  

![ssl1](./images/9/ssl1.png)

AWS에서

```bash
sudo vi /etc/nginx/nginx.conf
```

```bash
sudo nginx -t
```

```bash
sudo service nginx reload
sudo service nginx stop
```

```bash
wget https://dl.eff.org/certbot-auto
chmod a+x certbot-auto
sudo ./certbot-auto --nginx
```


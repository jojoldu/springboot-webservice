# 7. Nginx를 활용한 무중단 배포 구축하기

이번 시간엔 무중단 배포 환경을 구축하겠습니다.
(모든 코드는 [Github](https://github.com/jojoldu/springboot-webservice/tree/feature/7)에 있습니다.)  
## 7-1. 이전시간의 문제점?

[이전 시간](http://jojoldu.tistory.com/265)에 저희는 스프링부트 프로젝트를 Travis CI를 활용하여 배포 자동화 환경을 구축해보았습니다.  
이젠 Master 브랜치에 Push만 되면 자동으로 빌드 & 테스트 & 배포가 자동으로 이루어집니다.  
하지만!  

## 7-2. 무중단 배포?

## 7-3. 무중단 배포 구축하기


### Nginx 설치

```bash
sudo yum install nginx
```

Nginx 실행

```bash
sudo service nginx start
```

Nginx 실행 확인

```bash
ps -ef | grep nginx
```

![nginx 실행 확인](./images/nginx확인.png)

### Let's Encrypt 설치

도메인 할당 받고 오기

```bash
sudo yum install epel-release
```

맥북에서

```bash
sudo vim /etc/hosts
```

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


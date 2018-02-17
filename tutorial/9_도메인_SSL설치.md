# 9. 도메인 구입 및 SSL 인증서 설치

이번 시간엔 지금까지 만든 프로젝트에 도메인을 연결해보겠습니다.
(모든 코드는 [Github](https://github.com/jojoldu/springboot-webservice/tree/feature/9)에 있습니다.)  

저는 회사에서도 구글 계정으로 모든 처리를 진행하고 있어 연습 삼아 구글 호스팅 서비스를 사용하겠습니다.  
다른 분들은 좀 더 저렴한 국내 서비스를 쓰셔도 됩니다.  
이번 과정부터는 **비용이 직접 청구되니** 당장 서비스하실게 아니라면 가장 하단에 있는 **9-4. 타임존 변경**만 진행하셔도 됩니다!  

> Tip)  
도메인 구매를 진행하신다면 **Master** 혹은 **VISA 카드**가 하나 있어야 합니다.

## 9-1. 도메인 및 서비스 메일 생성

G Suite는 **구글에서 제공하는 비지니스 서비스** 입니다.  
회사에서 사용하기 위한 이메일과 도메인, 구글 앱스등을 제공하는데요.  
보통 회사에서 업무용 이메일을 구성원들에게 나눠주고, 회사내에서 사용할 문서들을 구글 드라이브에 올려서 사용하는 경우가 많은데요.  
이럴때 사용하는 서비스라고 보시면 됩니다.
여기서는 G Suite를 통해 비지니스 이메일 계정과 도메인 서비스를 이용하겠습니다.  
  
먼저 [링크](https://gsuite.google.com/intl/ko/)로 접속합니다.  
아래와 같이 G Suite의 메인 페이지에서 **무료평가판 시작**을 클릭합니다.

![gsuite1](./images/9/gsuite1.png)

본인이 원하는 업체(서비스)이름을 등록하시고, 직원수는 1명으로 합니다.
(직원수에 따라 비용이 변경되니 최저인원인 1명을 선택하세요)

![gsuite2](./images/9/gsuite2.png)

현재 사용중인 Email을 등록합니다.  
G Suite로 생성할 비지니스 이메일에 관련된 정보나 비용 청구서를 받아볼 계정이니 개인 계정을 등록하시면 됩니다.

![gsuite3](./images/9/gsuite3.png)

현재 저희가 갖고 있는 도메인이 없기 때문에 우측을 선택합니다.  
만약 갖고 계신 도메인이 있다면 해당 도메인을 쓰시면 됩니다.  
여기선 G Suite에서 도메인 구입까지 한꺼번에 진행합니다.

![gsuite4](./images/9/gsuite4.png)

저는 ```sprinboot-webservice.com```으로 도메인을 구매했습니다.  
이 글을 보시는 분들은 본인이 원하는 다른 도메인을 구매하시면 됩니다!  

![gsuite5](./images/9/gsuite5.png)

우측 버튼을 클릭해서 검색하시면 아래와 같이 사용가능 여부와 비용이 함께 보입니다.  
선택한 도메인이 맞다면 **다음**을 클릭합니다.

![gsuite6](./images/9/gsuite6.png)

업체 정보 입력란이 나오면,  
본인의 집 주소를 입력합니다.

![gsuite7](./images/9/gsuite7.png)

본인 이름을 등록하시고

![gsuite8](./images/9/gsuite8.png)

이제 사용하실 비지니스 이메일을 하나 생성합니다.  
보통 관리자 계정은 noreply 혹은 no-reply로 되어있기 때문에 저 역시 여기에선 noreply로 하겠습니다.  
이렇게 생성하시면 ```noreply@springboot-webservice.com```이란 이메일이 생성됩니다.

![gsuite9](./images/9/gsuite9.png)

도메인 구매를 진행하는데요.  
보통 ```.com``` 도메인은 년간 12달러(즉, 한화 약 12,000원) 정도합니다.  
크게 부담스러운 금액은 아니지만, 혹시나 테스트만 하신다면 나중에 자동갱신을 취소하셔야 합니다.

![gsuite10](./images/9/gsuite10.png)

약관에 동의하시고

![gsuite11](./images/9/gsuite11.png)

결제할 카드 정보를 등록합니다.

![gsuite12](./images/9/gsuite12.png)

개인 이메일 계정으로 도메인 구매 인증 메일이 도착했을테니 확인합니다.

![gsuite13](./images/9/gsuite13.png)

이메일 주소가 인증되셨으면 다시 원래 G Suite 가입 페이지로 가보시면 확인 안내가 있습니다.  
**계속** 버튼을 클릭합니다.

![gsuite14](./images/9/gsuite14.png)

자 그럼 저희가 G Suite를 통해 구매한 내역이 나옵니다.

![gsuite15](./images/9/gsuite15.png)

G Suite 비지니스 계정은 현재 14일 무료평가판을 사용중이며, 도메인은 구매해서 년간 ```$12```로 청구될 예정입니다. (```$12```를 분할해서 매월 청구되는 방식입니다. 월 ```$1```가 되겠죠?)  
  
자 그럼 비지니스 이메일 계정이 잘 생성되었는지 확인해보겠습니다.  
브라우저를 열어 구매한 비지니스 계정으로 로그인해봅니다.

![gsuite16](./images/9/gsuite16.png)

로그인이 잘 되네요!  
자 그럼 이메일 수신도 잘되는지 한번 테스트 해봅니다.  

![gsuite17](./images/9/gsuite17.png)

개인 이메일로 방금 구매한 비지니스 이메일 계정에 테스트 메일을 발송해봅니다.  
그러면!

![gsuite18](./images/9/gsuite18.png)

테스트 메일이 잘 도착합니다.  
즉, 앞으로 서비스를 운영하면서 외부와 이메일을 주고 받을때는 이 비지니스 계정으로 진행하시면 되겠죠?
자 그럼 이제 구매한 도메인을 AWS EC2에 연결해보겠습니다!

## 9-2. AWS Route 53 연결

먼저 AWS의 [Route53](https://console.aws.amazon.com/route53/home)으로 이동합니다.

![route1](./images/9/route1.png)

좌측의 사이드바부터 시작해서 **Hosted zones** -> **Create Hosted Zone** -> 우측 사이드바의 **Domain Name**을 차례로 클릭 & 입력합니다.

![route2](./images/9/route2.png)

자 그럼 차례로 도메인을 추가해보겠습니다.

### 9-2-1. EC2와 도메인 연결

Hosted Zone이 생성되었으면 해당 Hosted Zone을 클릭합니다.

![route3](./images/9/route3.png)

그동안 배포해왔던 EC2 IP를 G Suite에서 구매한 도메인에 연결하겠습니다.  
[EC2](https://ap-northeast-2.console.aws.amazon.com/ec2/v2/home?region=ap-northeast-2#Instances:sort=desc:instanceId)의 EIP를 복사해서

![route4](./images/9/route4.png)

**Create Record Set**을 클릭해 우측의 **Value**에 EIP를 붙여넣기 합니다.  
여기서 **Name에는 아무것도 입력하지 않습니다**.

![route5](./images/9/route5.png)

Name에 아무것도 입력하지 않았기 때문에 ```springboot-webservice.com```이 EC2에 연결되었음을 알 수 있습니다.

![route6](./images/9/route6.png)

하나더 추가해서 이번엔 ```www.springboot-webservice.com```을 연결하겠습니다.

![route7](./images/9/route7.png)

그리고 Google에서 구매한 도메인의 Name Server를 AWS용으로 변경하겠습니다.  

> Tip)  
Name Server에 대한 좀 더 자세한 정보는 [생활코딩-네임서버](https://opentutorials.org/course/228/1455) 영상을 참고하시면 좋습니다!

Route53 페이지를 보시면 저희가 등록한 것 외에 생성된 2개 값이 있는데요.  
여기서 Type이 **NS** (Name Server)를 보시면 4개의 값들이 있습니다.  
이게 AWS Name Server입니다.  

![route8](./images/9/route8.png)

이 값들을 복사해서 구글 도메인 서비스의 Name Server로 등록합니다.  
[구글 도메인](https://domains.google.com/registrar)으로 접속하시면 다음과 같은 화면이 노출되는데요.

![route9](./images/9/route9.png)

**DNS**버튼을 클릭 하시면 다음과 같이 도메인에 대한 정보가 나옵니다.  

![route10](./images/9/route10.png)

여기서 **맞춤 네임서버 사용**을 선택하셔서 Route53에 있던 Name Server정보를 하나씩 등록합니다.

![route11](./images/9/route11.png)

자! 그리고 Name Server가 반영될 시간(약 1~2분) 기다리신뒤, 해당 도메인으로 접속해보시면!!

![route12](./images/9/route12.png)

드디어 저희 서비스가 외부에 오픈되었습니다!

### 9-2-2. Google 이메일 연결

한가지 문제가 생겼습니다.  
구글 도메인의 Name Server를 AWS로 변경했기 때문에 구글에서 생성한 Email로 메일 수신이 안되게 되었습니다!  
(테스트로 메일 다시 보내보시면 안되는걸 확인할 수 있습니다.)  
그래서 이번엔 구글 Email을 AWS Route53에 등록하겠습니다.  
**Create Record Set**을 클릭해서 새로운 Record Set을 등록합니다.

![route13](./images/9/route13.png)

* Type: MX
* TTL: 3600
* Value: 아래 내용 복사

```
1 ASPMX.L.GOOGLE.COM  
5 ALT1.ASPMX.L.GOOGLE.COM  
5 ALT2.ASPMX.L.GOOGLE.COM  
10 ALT3.ASPMX.L.GOOGLE.COM  
10 ALT4.ASPMX.L.GOOGLE.COM  
```

등록이 완료되셨으면, 다음으로 G Suite Mail Name Server를 등록하겠습니다.  
먼저 [구글 admin](https://admin.google.com/) 페이지로 이동합니다.  
아래 순서대로 페이지를 이동합니다.

![route14](./images/9/route14.png)

![route15](./images/9/route15.png)

![route16](./images/9/route16.png)

![route17](./images/9/route17.png)

이메일 인증을 클릭하시면 아래와 같이 2개의 값이 출력됩니다.  
이 화면은 그대로 두고, AWS Route53 페이지로 이동합니다.

![route18](./images/9/route18.png)

Route 53페이지에서 **Create Record Set**을 클릭합니다.  
여기서 좀전의 구글 이메일 도메인 설정창의 값을 하나씩 입력합니다.  

* DNS 호스트 이름은 Route53의 Name으로
* TXT 레코드값은 Route53의 Value로 
* Type은 TXT-Text로

복사합니다.

![route19](./images/9/route19.png)

그리고 **Create**를 클릭하시면!

![route20](./images/9/route20.png)

에러가 발생합니다.  
메세지에서 나와있듯이 에러가 발생하는 이유는 ```""```안의 내용이 너무 길기 때문입니다.  
그래서 ```""```을 좀 분리해서 넣겠습니다.  
예를 들어 Value가 아래와 같다면

```java
"v=DKIM1; k=rsa;
p=abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz
abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab
cdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabc"
```

다음과 같이 ```""```로 문단을 나눠서 복사합니다.

```java
"v=DKIM1; k=rsa;
p=abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab"
"cdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabc"
```

(이건 제 코드이기 때문에 각자 본인의 코드를 적당한 위치에서 ```""```로 분리하셔야 합니다.)  
  
```java
"v=DKIM1; k=rsa; p=MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi4cIuJwVEoHU3R66tUjH8q9i87/Q081PyTnpe8TrOZD2NTxAJU2Zav1n/NWWCYwILUa9ip14BoRGrwgXjWw5cf0KRxGeEt74Tc7OXMY2CMy2c5S5S9NctDMBO6ei3ehyJk""+iHJ6LvRDqmEnvwMoTBqBIa91G1dtUquGLhqSTpouzqxNpAb9V8TD8umiYWg4qJX5tIxgjYPCnqikxhUMgmtORJQhsJmDQkZKXwDty816""+3Nx9p/lDAQi85JchJ1PUIBrtWXlaN1irJu60WfTs0Yus0rIZq7NgXCxqzGKmBr6mOO+ewlloKkfCQmyebxtjIpovC/Vg3C3HjNTMwrKhwQIDAQAB"
```

그래서 최종 Record set은 다음처럼 됩니다

![route21](./images/9/route21.png)

자 이제 다시 G Suite 이메일로 메일을 발송해봅니다.  
아래처럼 다시 보낸 메일이 잘 도착하셨나요!?

![route22](./images/9/route22.png)

이제는 서비스 도메인과 서비스 이메일 생성이 완료 되었습니다!

## 9-3. HTTPS 연결

도메인 작업이 완료 되었으니, 이번엔 HTTPS를 서비스에 등록해보겠습니다.  
HTTPS가 없더라도 서비스에 문제는 없지만, 최근 동향이 **"HTTPS는 기본적으로 갖추자"** 로 가기 때문에 이번 기회에 시작해보시는걸 추천드립니다.

> Tip)  
[HTTPS는 HTTP보다 빠르다](https://tech.ssut.me/2017/05/07/https-is-faster-than-http/), 
[구글 "네이버·다음은 왜 https 적용 안하나...크롬에서 경고 표시 띄울 것"](http://biz.chosun.com/site/data/html_dir/2017/02/13/2017021302077.html)
등 웹 사이트에서 HTTPS는 기본적으로 사용하자는 움직임이 많습니다.  

> Tip)  
HTTP와 HTTPS에 대한 차이점을 알고싶으신 분들은 [HTTP 프로토콜 - joinc](https://www.joinc.co.kr/w/Site/Network_Programing/AdvancedComm/HTTP#s-5.)를 참고하시거나 가장 추천하는 네트워크 교재인 [그림으로 배우는 HTTP & Network Basic](http://www.kyobobook.co.kr/product/detailViewKor.laf?barcode=9788931447897)를 읽어보시면  좋습니다!


### 9-3-1. Let's Encrypt 설치

예전에는 비용을 지불해서 유료 인증서를 구입했지만, 최근 오픈소스 인증서인 [Let's Encrypt](https://blog.outsider.ne.kr/1178)가 등장해서 무료로 HTTPS를 사용할수 있게 되었습니다.  
특히 Let's Encrypt 설치 및 업데이트를 쉽게 해주는 certbot이 등장해서 사용하기도 굉장히 수월해졌습니다.  

* [certbox](https://certbot.eff.org/#centosrhel6-nginx)
* [Amazon Linux에서 Apache + Certbot의 Let's Encrypt](https://docs.aws.amazon.com/ko_kr/AWSEC2/latest/UserGuide/SSL-on-an-instance.html#letsencrypt)

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

그럼 이제 certbot을 통해 Nginx에 HTTPS를 설정하겠습니다.  

> Tip)  
모든 과정은 아래 이미지로 전부 캡쳐했으니 그걸 보셔도 무방합니다.

다음의 명령어를 입력합니다.

```bash
sudo /home/ec2-user/certbot-auto --nginx
```

명령어가 실행되면 몇가지가 수행되다가 도메인 입력을 하라는 메세지가 나옵니다.

```bash
No names were found in your configuration files. Please enter in your domain
name(s) (comma and/or space separated)  (Enter 'c' to cancel):example.com www.example.com
```

여기서 example.com과 www.example.com은 우리 서비스의 도메인을 얘기합니다.  
저는 ```springboot-webservice.com```과 ```www.springboot-webservice.com```으로 입력했습니다.  
다음으로 웹 서버에 보안성이 낮은 연결을 허용할지를 선택합니다.  
예제에 나와 있는 것과 같이 옵션 2를 선택하면 모든 서버 연결이 HTTPS로 연결됩니다.  
(저는 2를 선택했습니다.)  

```bash
Please choose whether or not to redirect HTTP traffic to HTTPS, removing HTTP access.
-------------------------------------------------------------------------------
1: No redirect - Make no further changes to the webserver configuration.
2: Redirect - Make all requests redirect to secure HTTPS access. Choose this for
new sites, or if you're confident your site works on HTTPS. You can undo this
change by editing your web server's configuration.
-------------------------------------------------------------------------------
Select the appropriate number [1-2] then [enter] (press 'c' to cancel): 2
```

이렇게 하시면! 모든 설정이 완료 됩니다!

![ssl2](./images/9/ssl2.png)

자 한번 우리 서비스를 다시 접속해볼까요?

![ssl3](./images/9/ssl3.png)

와우! 서비스에 https가 적용되었습니다!  
이제 보안도 챙기고, 크롬브라우저에서 저희 서비스가 경고메세지가 출력될일도 없겠죠?  

### 9-3-2. Let's Encrypt 인증서 자동 갱신 등록

SSL 인증서 설치는 끝이났습니다!  
여기서 실제 서비스로 이용해야할때 한가지 작업이 더 필요합니다.  
바로 인증서 자동 갱신입니다.  
아래처럼 Let's Encrypt는 인증서가 3개월이면 만료가 됩니다.  

![ssl4](./images/9/ssl4.png)

3개월마다 인증서를 갱신해야하는데, 이걸 사람이 직접 하기엔 귀찮은 작업이 됩니다.  
그래서 이 인증서 갱신을 자동화 시키겠습니다.  
보통 이렇게 리눅스 서버에 스케줄 작업을 걸때 crontab을 많이 사용합니다.

> Tip)  
crontab(크론탭)의 설명은 [제타위키](https://zetawiki.com/wiki/%EB%A6%AC%EB%88%85%EC%8A%A4_%EB%B0%98%EB%B3%B5_%EC%98%88%EC%95%BD%EC%9E%91%EC%97%85_cron,_crond,_crontab)가 가장 잘되어있기 때문에 한번 읽어보시면 금방 이해되실것 같습니다.

그럼 crontab에 인증서 갱신 작업을 등록하겠습니다.  
아래 명령어로 crontab 편집창을 열고,

```bash
crontab -e
```

다음의 코드를 등록합니다.

```bash
# Begin Let's encrypt renew
0 4 1 */3 * /bin/bash -l -c '/home/ec2-user/certbot-auto renew'
# End Let's encrypt renew
```

![ssl5](./images/9/ssl5.png)

등록한 시간은 **3개월에 1번씩 새벽 4시**에 수행한다는 내용입니다.  

> Tip)  
[crontab.guru](https://crontab.guru/#0_4_1_*/3_*)을 통해 수행 주기를 확인할 수 있습니다.

vi에서 저장할때와 마찬가지로 ```:wq```로 저장 & 종료하면 crontab이 정상적으로 등록됩니다!

### 9-3-3. 인증서 갱신 중 오류 발생시

만약 인증서 갱신 도중 오류가 발생하시면 아래 명령어를 차례로 입력하시면 됩니다.  
기존의 certbot으로 설치된 내용들을 삭제하신뒤,

```bash
sudo rm -rf /root/.local/share/letsencrypt/
sudo rm -rf /opt/eff.org/certbot/
```

다시 갱신을 시도합니다.

```bash
/home/ec2-user/certbot-auto renew -v --debug
```

## 9-4. 타임존 변경

이 시간은 crontab 편에 이어서 진행됩니다.  
EC2를 처음 설치하게 되면 타임존이 UTC가 됩니다.  

![timezone1](./images/9/timezone1.png)

현재 시간이 UTC로 되어있어, 모든 서버 관련 데이터가 한국시간 보다 9시간 차이가 납니다.  
이는 데이터베이스에서도 마찬가지인데요.  
RDS도 기본 UTC인지라 아래와 같이 시간이 출력됩니다.
(캡쳐 당시 **한국시간은 2/17일 15시**였습니다.)

![timezone2](./images/9/timezone2.png)

그래서 EC2와 RDS의 타임존을 KST(한국시간)으로 변경하겠습니다.  

### 9-4-1. EC2 타임존 변경

아래명령어를 EC2에서 차례로 입력합니다.

```bash
sudo rm /etc/localtime
sudo ln -s /usr/share/zoneinfo/Asia/Seoul /etc/localtime
date
```

![timezone3](./images/9/timezone3.png)

최종 반영을 위해 EC2를 한번 부팅합니다.

```bash
sudo reboot
```

부팅후 10분뒤에 다시 재접속해서 시간을 확인해보시면!

```bash
date
```

![timezone4](./images/9/timezone4.png)

정상적으로 반영되었습니다!  

### 9-4-2. RDS 타임존 변경

이제는 RDS의 타임존을 변경하겠습니다.  
먼저 RDS의 파라미터 그룹으로 이동합니다.  
해당 RDS를 선택후, **파라미터 편집**을 선택합니다.   

![timezone5](./images/9/timezone5.png)

필터에 ```time_zone```을 입력해 **time_zone** 파라미터를 찾습니다.

![timezone6](./images/9/timezone6.png)

**time_zone** 값을 **Aisa/Seoul**을 선택합니다.
자 **변경 사항 저장**을 클릭해 최종 저장합니다.

![timezone7](./images/9/timezone7.png)

그럼 RDS가 수정작업을 진행합니다.

![timezone8](./images/9/timezone8.png)

수정 작업이 끝난후, DB 툴을 통해 아래 쿼리를 실행해보시면!

```sql
select @@time_zone, now();
```

타임존이 변경된 것을 확인할 수 있습니다!

![timezone9](./images/9/timezone9.png)

RDS도 정상적으로 한국 시간이 반영되었습니다!

## 마무리

**하나의 서비스를 개발하는 모든 과정을 진행**했습니다!  
어떠셨나요!?  
단순히 localhost:8080만 진행할때와는 전혀 다른 어려움이 많지 않으셨나요?  
그래도 이제는 **본인의 힘으로 하나의 서비스를 구축**할수 있게 되었습니다.  
다음은 이번 시리즈의 마지막 챕터가 되겠습니다.  
**서비스를 구축할때 미리 알았으면 좋았을 법한 팁**들을 모아 공유드릴 예정입니다.  
마지막까지 잘 부탁드리겠습니다!  
고맙습니다^^

## 참고

* [Email 연결](https://blog.andrewray.me/setting-up-gsuite-gmail-custom-domains-with-aws-route53/)
* [Amazon Linux에서 Certbot의 Let's Encrypt](https://docs.aws.amazon.com/ko_kr/AWSEC2/latest/UserGuide/SSL-on-an-instance.html#letsencrypt)


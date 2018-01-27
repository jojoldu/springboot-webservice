# 7. Nginx를 활용한 무중단 배포 구축하기

이번 시간엔 무중단 배포 환경을 구축하겠습니다.
(모든 코드는 [Github](https://github.com/jojoldu/springboot-webservice/tree/feature/7)에 있습니다.)  

## 7-1. 이전 시간의 문제점?

[이전 시간](http://jojoldu.tistory.com/265)에 저희는 스프링부트 프로젝트를 Travis CI를 활용하여 배포 자동화 환경을 구축해보았습니다.  
이젠 Master 브랜치에 Push만 되면 자동으로 빌드 & 테스트 & 배포가 자동으로 이루어집니다.  
하지만!  
배포하는 시간 동안은 어플리케이션이 종료가 됩니다.  
긴 시간은 아니지만, 새로운 Jar가 실행되기 전까진 기존 Jar를 종료시켜놓기 때문에 **서비스가 안됩니다.**  
**최근 웹 서비스들은 대부분 배포하기 위해 서비스를 정지시키는 경우가 없습니다**.  
어떻게 서비스의 정지 없이 배포를 계속 할 수 있는지 이번 시간에 확인하고 서비스에 적용해보겠습니다.

## 7-2. 무중단 배포?

예전에는 배포라고 하면 팀의 아주 큰 이벤트이기 때문에 다같이 코드를 합치는 날과 배포를 하는 날을 정하고 배포했습니다.  
(**배포만 전문으로 하는 팀**이 따로 있었습니다.)  
특히 배포일에는 사용자가 적은 새벽 시간에 개발자들이 모두 남아 배포를 해야만 했습니다.  
잦은 배포가 있어야 한다면 매 새벽마다 남아서 배포를 해야만 했는데, 이렇게 배포를 했는데 정말 치명적인 문제가 발견되면 어떻게 해야할까요?  
가장 사용자가 많은 시간임에도 전체 공지를 해서 서비스를 차단해야만 했습니다.  

이렇게 서비스를 정지시키지 않고, 배포를 계속하는 것을 **무중단 배포**라고 합니다.  


배포 환경에서 중요한건 **롤백 시나리오**입니다.  
배포

이렇게 배포환경을 계속 개선해나가는 이유는 간단합니다.  

### 7-2-3. 무중단 배포 전체 구조

![전체구조](./images/7/무중단배포전체구조.png)

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


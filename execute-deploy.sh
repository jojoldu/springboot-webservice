#!/bin/bash
rm -rf /home/ec2-user/app/nonstop/springboot-webservice/*
/home/ec2-user/app/nonstop/deploy.sh > /dev/null 2> /dev/null < /dev/null &

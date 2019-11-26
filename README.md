# RabbitMQ
This repo has the code for RabbitMQ implementation

To Start the RabbitMQ Server and enable UI Dashboard

1. rabbitmq-server start

2. rabbitmq-plugins.bat enable rabbitmq_management

3. http://localhost:15672/#/queues

Steps Before deploying:

Before Deploying the jar to the Cloud creae a queue service in PCF.
Give the queue name in manifest.yml file to link the jar and the queue.

To Deploy the JAR to PCF following commands are used:

cf login

Pushing the jar to cloud:
cf push Mj-ORG -p target\RabbitMQ_Producer-0.0.1-SNAPSHOT.jar



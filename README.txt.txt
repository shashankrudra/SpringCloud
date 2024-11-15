


http://localhost:8161/admin/queues.jsp

http://localhost:8761/


curl --location 'http://localhost:8080/product?code=Sale' \
--header 'Content-Type: application/json' \
--data '{
    "id":11,
    "name":"Tab11",
    "price":100
}'


curl --location 'http://localhost:8081/coupon/Sale'


curl --location 'http://localhost:8081/coupon' \
--header 'Content-Type: application/json' \
--data '{
    "id":1,
    "couponCode":"Sale",
    "discount":5
}'


curl --location 'http://localhost:8080/product/1'


curl --location 'http://localhost:8080/product' \
--header 'Content-Type: application/json' \
--data '{
    "id":2,
    "name":"Desktop",
    "price":200
}'


curl --location 'http://localhost:8080/product' \
--header 'Content-Type: application/json' \
--data '{
    "id":2,
    "name":"Desktop",
    "price":200
}'


curl --location 'http://localhost/cs/hello'


curl --location 'http://localhost/ps/product/type'


curl --location --request POST 'http://localhost/cs/actuator/refresh'

curl --location --request POST 'http://localhost/configserver/actuator/busrefresh'


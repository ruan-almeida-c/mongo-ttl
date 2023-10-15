## Container mongodb

1.```docker run --name poc-ttl -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=admin -e MONGO_INITDB_DATABASE=poc -p 27017:27017 -d mongo```
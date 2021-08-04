## Create local redis Database

docker run -it --name redis -p 6379:6379 redis


## Verify cache keys 
```

docker exec -it redis /bin/bash
redis-cli

KEYS *

```








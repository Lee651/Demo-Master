
# 
## 添加用户信息

**URL:** `/api/user/`

**Type:** `GET`


**Content-Type:** `application/x-www-form-urlencoded;charset=UTF-8`

**Description:** 添加用户信息



**Query-parameters:**

| Parameter | Type | Required | Description | Since |
|-----------|------|----------|-------------|-------|
|name|string|false|姓名|-|
|age|string|false|年龄|-|


**Request-example:**
```
curl -X GET -i /api/user/?name=doyle.grady&age=jpmmeq
```

**Response-example:**
```
Return void.
```


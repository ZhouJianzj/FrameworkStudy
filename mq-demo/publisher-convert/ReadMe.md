- 消息的处理是MessageConvert来处理的而它的简单实现则是simpleMessageConvert底层这是java的序列化，这样在传输效率和安全性方面就大打折扣了
所以我们使用json2来帮我们完成消息的json话格式转化
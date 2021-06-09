# 工程简介
RESTful 的设计风格\
关键的注解 @PathVariable\
1、主要改变是在path地址上使用/的形式替换之前的？ 和 &\
2、在分页或者排序的时候还是需要使用 ？和 & d的形式
注意：\
1、在使用@RequestMapping的时候会出现混淆不清的参数匹配异常，解决方案就是指定业务方法特动定的处理请求\
2、在一样的处理请求的方式的时候出现多个的时候也会出现1出现的问题，解决办法就是调整顺序\
例如：\
@GetMapping(value ="/findStu/detail/{id}/{name}")\
@GetMapping(value ="/findStu/{id}/detail/{name}")

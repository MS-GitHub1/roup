#language:zh-CN
  功能: 用户登录
    为了测试登录功能是否正常
    场景: 正确的账号登录
      当我打开qq邮箱网站
      并且我在email文本框输入"2581166083"
      并且在密码文本框输入"chao19961116"
      并且点击登录按钮
      那么登录成功

    场景大纲:登录2
      当我打开qq邮箱网站
      并且我在email文本框输入"<username>"
      并且在密码文本框输入"<pwd>"
      并且点击登录按钮
      那么登录成功
      例子:
        | username | pwd |
        | test1    | pwd1|
        | test2    | pwd2|
        | test3    | pwd3|
        | test4    | pwd4|

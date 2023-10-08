git hook 操作手册  
参考地址  
git 钩子的使用: https://git-scm.com/book/zh/v2/%E8%87%AA%E5%AE%9A%E4%B9%89-Git-Git-%E9%92%A9%E5%AD%90  
gradle Checkstyle Plugin: https://docs.gradle.org/current/userguide/checkstyle_plugin.html  
Checkstyle规则说明: https://checkstyle.sourceforge.io/checks.html  

目的  
团队协作强制代码规范检查，希望每一位开发同学一起维护和使用起来我们的开发规范  

检查所有的需要的配置文件  
hook  
├── pre-commit  
├── commit-msg  
├── hooks.sh  
├── checkstyle.xml  
├── checkstyle.gradle  

配置文件说明  
1.pre-commit:        git commit 时执行的命令  
2.commit-msg:        git commit msg 时执行的命令  
3.hooks.sh:          项目添加 git hooks 执行命令的命令  
4.checkstyle.xml:    规范检查配置文件  
5.checkstyle.gradle: git commit执行命令中需要gradle执行的task task 做的任务就是对新增或改动的文件做了checkstyle检查  

集成步骤：  
1.在项目根目录的build.gradle 中引入 checkstyle.gradle文件  
```
apply from: "hook/checkstyle.gradle"
```
2.初始化.git hook 配置文件  
在Android studio中打开Terminal 或者是cmd后cd到项目根目录下执行下面命令  
#进到hook文件夹  
 cd hook  
#给hooks.sh脚本增加可执行权限  
 chmod 777 hooks.sh  
#执行hook.sh 文件  
 ./hooks.sh  

到项目根目录文件夹中查看.git -->hooks 文件夹中是否包含 pre-commit和commit-msg 两个可执行文件 (结尾带有.sample的不算)  
#退出  
cd ..  
到此 集成已完成，可以创建不符合checkstyle 的代码测试下  

辅助工具  
commit-msg的规范可以借助Git Commit Template插件完成（https://plugins.jetbrains.com/plugin/9861-git-commit-template）  

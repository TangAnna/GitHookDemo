git hook 使用方式
检查所有的需要的配置文件
hook
├── pre-commit
├── commit-msg
├── hooks.sh
├── checkstyle.xml
├── checkstyle.gradle

集成步骤：
1.在项目根目录的build.gradle 中引入 checkstyle.gradle文件
```
apply from: "hook/checkstyle.gradle"
```
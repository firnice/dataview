# dataview
  展示数据库结构


* ## 目的
  通过系统来展示数据流转，解决数据库数据流转不直观

* ## 过程
 1，草图
    //如果做成流程图，前端的活比较多，先做成大表格模式

   a,状态机节点。//并不全面
   b,是否结束。
   c,数据来源
        1,接口
        2,内部数据
        3,客户输入

 2，数据库


现有表：
    DATA_SOURCE_FACTORY  //数据源
    DATA_TABLE           //数据源的表
    DATA_COLUMN          //表的列项目
 
 3，程序


* ##所用技术
 前端 bootsrap avalon//没使用
 web spring mvc
 数据库 h2 ,  postgreSql //数据类型可能不通用
 数据库框架 jpa



 TODO
 1，js优化（不急）

 2，页面大概结构






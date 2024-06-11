### 父子模块
        在Maven中，子module会继承父module的依赖，但这并不意味着子module不需要在自己的pom文件中声明依赖。
    子module会继承父module的依赖，但在实践中，为了项目的清晰性和可维护性，推荐在子module的pom文件中明确声明所需的依赖。

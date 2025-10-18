const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot58s816sf/",
            name: "springboot58s816sf",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot58s816sf/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Java的宠物用品系统的设计与实现"
        } 
    }
}
export default base

const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmqi99g/",
            name: "ssmqi99g",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmqi99g/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "咖啡销售系统"
        } 
    }
}
export default base

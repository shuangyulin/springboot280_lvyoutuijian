const base = {
    get() {
        return {
            url : "http://localhost:8080/lvyoutuijianxitong/",
            name: "lvyoutuijianxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/lvyoutuijianxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "旅游推荐系统"
        } 
    }
}
export default base

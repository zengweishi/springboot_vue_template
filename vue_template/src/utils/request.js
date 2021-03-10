//封装axios请求，没有安装axios的话npm install axios
//axios文档：https://www.kancloud.cn/yunye/axios/234845
import axios from 'axios'

const service = axios.create({
  baseURL: "/api",
  timeout:5000
})
//默认导出service
export default service

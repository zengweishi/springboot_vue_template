//相当于导入request中的service（request.js中有export default service,service是一个自定义的axios实例）
import request from '@/utils/request'

export function getHomePage() {
  return request({
    url:"/homePage/home",
    method:'get'
  })
}

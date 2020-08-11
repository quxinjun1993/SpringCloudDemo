package com.quxinjun.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class PreZuulFilter extends ZuulFilter {

    /**
     * 1.pre:可以在请求之前拦截
     * 2:route:可以在路由请求时拦截
     * 3:post:在route和error之后被调用
     * error:处理请求，出现异常被调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1    ;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("this is pre Filter ...............");
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        System.out.println(request.getRequestURI());
        Map<String, String[]> parameterMap = request.getParameterMap();
        String token = request.getHeader("token");
        if(StringUtils.isEmpty(token)){
            this.respose(RequestContext.getCurrentContext());
        }
        return null;
    }

    private void respose(RequestContext requestContext){
        requestContext.setSendZuulResponse(false);
        requestContext.getResponse().setCharacterEncoding("UTF-8");
        requestContext.getResponse().setContentType("application/json");
        requestContext.setResponseBody("未能获取到token,请求失败");
    }
}

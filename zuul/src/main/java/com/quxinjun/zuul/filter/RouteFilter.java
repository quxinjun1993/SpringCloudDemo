package com.quxinjun.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class RouteFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("this is route Filter ...............");
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        Map<String, String[]> parameterMap = request.getParameterMap();
        String token = request.getHeader("token");
        System.out.println("token:" + token);
        return null;
    }
}

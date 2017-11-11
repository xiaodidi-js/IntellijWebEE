package com.codeing.Filter;

import javax.servlet.*;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

public class CORSFilter implements Filter {

    /**
     * 烧毁
     */
    public void destroy() {

    }

    /**
     * 过滤跨越
     * @param req
     * @param res
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(req, res);
    }

    /**
     * 初始化
     * @param config
     * @throws ServletException
     */
    public void init(FilterConfig config) throws ServletException {

    }
}

package tiagobarbosa.marathonjsf.filter;

import tiagobarbosa.marathonjsf.bean.login.LoginBean;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Inject
    private LoginBean loginBean;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String url = req.getRequestURL().toString();
        System.out.println(url);
        if (url.contains("/restricted") && loginBean.getStudent() == null) {
            res.sendRedirect(req.getServletContext().getContextPath() + "/login.xhtml");
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}

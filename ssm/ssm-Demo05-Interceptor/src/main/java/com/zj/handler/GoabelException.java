package com.zj.handler;


import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zj.exception.AgeException;
import com.zj.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GoabelException {
    /**
     * 异常处理器
     * @param exception NameException
     * @return ModelAndView
     */
    @ExceptionHandler(NameException.class)
    public ModelAndView handledNameException(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex",exception);
        mv.setViewName("exception");
        return mv;
    }
    @ExceptionHandler(AgeException.class)
    public ModelAndView handledAgeException(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex",exception);
        mv.setViewName("exception");
        return mv;
    }
}

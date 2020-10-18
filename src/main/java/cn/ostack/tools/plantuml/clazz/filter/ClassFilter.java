package cn.ostack.tools.plantuml.clazz.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(ClassFilter.class);

    @Override
    public boolean isFilter(Class clazz, String startPre) throws Exception {
        if (clazz.getName().contains(startPre)) {
            logger.info("Find class not concern:{},", clazz.getName(), startPre);
            return true;
        } else {
            return false;
        }
    }
}

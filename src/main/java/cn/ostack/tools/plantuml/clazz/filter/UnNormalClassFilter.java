package cn.ostack.tools.plantuml.clazz.filter;

public class UnNormalClassFilter implements Filter {

    @Override
    public boolean isFilter(Class clazz, String startPre) throws Exception {
        return false;
    }
}

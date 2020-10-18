package cn.ostack.tools.plantuml.clazz.filter;

public interface Filter {
    boolean isFilter(Class clazz, String startPre) throws Exception;
}

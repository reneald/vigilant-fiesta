package be.leanderonline.cscg.api;

import org.modelmapper.ModelMapper;

public class ModelMapperUtil {
    private final static ModelMapper modelMapper;
    static {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);
    }

    public static <T> T map(Object source, Class<T> targetClass) {
        return modelMapper.map(source, targetClass);
    }
}

package be.leanderonline.cscg.api;

import org.modelmapper.ModelMapper;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModelMapperUtil {
    private static final ModelMapper modelMapper;

    private ModelMapperUtil() {
        //hide implicit public constructor
    }

    static {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);
    }

    public static <S, T> T map(S source, Class<T> targetClass) {
        return modelMapper.map(source, targetClass);
    }

    public static <S, T> List<T> mapToList(Collection<S> source, Class<T> targetClass) {
        return mapCollection(source, targetClass, ArrayList::new, Collections::emptyList);
    }

    public static <S, T> Set<T> mapToSet(Collection<S> source, Class<T> targetClass) {
        return mapCollection(source, targetClass, HashSet::new, Collections::emptySet);
    }

    public static <S, T, C extends Collection<T>> C mapCollection(Collection<S> source, Class<T> targetClass, Supplier<C> collectionSupplier, Supplier<C> defaultSupplier) {
        if (source != null && !source.isEmpty()) {
            return source.stream()
                    .map(s -> map(s, targetClass))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toCollection(collectionSupplier));
        }
        return defaultSupplier.get();
    }
}

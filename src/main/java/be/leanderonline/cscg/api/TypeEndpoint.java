package be.leanderonline.cscg.api;

import be.leanderonline.cscg.model.TypeEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TypeEndpoint {
    @GetMapping("/type")
    public List<String> getTypes() {
        return Arrays.stream(TypeEnum.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }
}

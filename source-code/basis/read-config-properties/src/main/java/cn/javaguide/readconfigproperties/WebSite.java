package cn.javaguide.readconfigproperties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:website.properties")
@Getter
@Setter
class WebSite {
    @Value("${url}")
    private String url;
    //可以省略
    WebSite(){}//无参构造会自动生成，可以省略.但是如果写了有参则必须保留
//    WebSite(String str){
//        System.out.println(str+url);
//        this.url = url;
//    }
}

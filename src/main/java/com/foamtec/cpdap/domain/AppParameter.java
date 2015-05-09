package com.foamtec.cpdap.domain;
import com.foamtec.cpdap.base.BaseEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(inheritanceType = "TABLE_PER_CLASS")
@RooJson(deepSerialize = true)
public class AppParameter extends BaseEntity {

    /**
     */
    @NotNull
    @Column(unique = true)
    private String code;

    /**
     */
    private String parameterDescription;
}

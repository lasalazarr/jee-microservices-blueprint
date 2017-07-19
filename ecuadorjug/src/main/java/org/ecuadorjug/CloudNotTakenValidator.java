package org.ecuadorjug;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CloudNotTakenValidator implements ConstraintValidator<CloudNotValid, String> {

   @Inject
   private BusinessLogic businessLogic;

   public void initialize(CloudNotValid constraint) {
   }

   public boolean isValid(String obj, ConstraintValidatorContext context) {
      return !businessLogic.isCloudTaken(obj);
   }
}

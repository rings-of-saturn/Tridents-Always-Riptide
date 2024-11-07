package rings_of_saturn.github.io.tar.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static rings_of_saturn.github.io.tar.client.TARClient.isModActive;

@Mixin(Entity.class)
public class EntityMixin {
    @Inject(method = "isBeingRainedOn", at=@At("TAIL"), cancellable = true)
    public void alwaysRain(CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(isModActive);
    }
}

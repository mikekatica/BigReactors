package erogenousbeef.bigreactors.common.multiblock.tileentity;

import net.minecraft.util.math.BlockPos;
import zero.mods.zerocore.api.multiblock.validation.IMultiblockValidator;

public class TileEntityReactorGlass extends TileEntityReactorPartBase {

	@Override
	public boolean isGoodForFrame(IMultiblockValidator validatorCallback) {

		BlockPos position = this.getPos();

		validatorCallback.setLastError("multiblock.validation.reactor.invalid_glass_position", position.getX(), position.getY(), position.getZ());
		return false;
	}

	@Override
	public boolean isGoodForSides(IMultiblockValidator validatorCallback) {
		return true;
	}

	@Override
	public boolean isGoodForTop(IMultiblockValidator validatorCallback) {
		return true;
	}

	@Override
	public boolean isGoodForBottom(IMultiblockValidator validatorCallback) {
		return true;
	}

	@Override
	public boolean isGoodForInterior(IMultiblockValidator validatorCallback) {

		BlockPos position = this.getPos();

		validatorCallback.setLastError("multiblock.validation.reactor.invalid_glass_position", position.getX(), position.getY(), position.getZ());
		return false;
	}

	@Override
	public void onMachineActivated() {
	}

	@Override
	public void onMachineDeactivated() {
	}
}

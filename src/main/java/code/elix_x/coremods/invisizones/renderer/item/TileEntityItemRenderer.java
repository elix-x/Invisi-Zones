package code.elix_x.coremods.invisizones.renderer.item;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

public class TileEntityItemRenderer implements IItemRenderer {

	TileEntitySpecialRenderer renderer;
	TileEntity tileentity;

	public TileEntityItemRenderer(TileEntitySpecialRenderer render, TileEntity tile){
		renderer = render;
		tileentity = tile;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		if(type == IItemRenderer.ItemRenderType.ENTITY)		{
			GL11.glTranslatef(-0.5f, 0.0f, -0.5f);
		}
		this.renderer.renderTileEntityAt(this.tileentity, 0.0D, 0.0D, 0.0D, 0.0F);
	}

}

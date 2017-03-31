package monument.api;

import java.util.Collection;

public class Pyx {
	private Collection<Relic> relics;
	private Permission permission;
	
	public Collection<Relic> getRelics() {
		return relics;
	}
	public void setRelics(Collection<Relic> relics) {
		this.relics = relics;
	}
	public Permission getPermission() {
		return permission;
	}
	public void setPermission(Permission permission) {
		this.permission = permission;
	}
}

public abstract class Character implements WeaponBehavior{

    private WeaponBehavior weapon;

    private void setWeapon(WeaponBehavior w)
    {
        this.weapon = w;
    }

    @Override
    public void useWeapon() {
        
    }
    
    public abstract void fight();
}

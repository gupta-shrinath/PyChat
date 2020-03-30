package io.realm;


public interface personal_droid_pychat_models_ChatRealmProxyInterface {
    public RealmList<personal.droid.pychat.models.Message> realmGet$messages();
    public void realmSet$messages(RealmList<personal.droid.pychat.models.Message> value);
    public String realmGet$lastMessage();
    public void realmSet$lastMessage(String value);
    public String realmGet$myId();
    public void realmSet$myId(String value);
    public String realmGet$chatId();
    public void realmSet$chatId(String value);
    public String realmGet$chatName();
    public void realmSet$chatName(String value);
    public String realmGet$chatImage();
    public void realmSet$chatImage(String value);
    public long realmGet$timeUpdated();
    public void realmSet$timeUpdated(long value);
    public boolean realmGet$read();
    public void realmSet$read(boolean value);
    public boolean realmGet$group();
    public void realmSet$group(boolean value);
}

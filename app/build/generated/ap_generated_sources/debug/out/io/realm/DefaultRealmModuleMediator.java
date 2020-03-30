package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(7);
        modelClasses.add(personal.droid.pychat.models.Message.class);
        modelClasses.add(personal.droid.pychat.models.User.class);
        modelClasses.add(personal.droid.pychat.models.Group.class);
        modelClasses.add(personal.droid.pychat.models.Attachment.class);
        modelClasses.add(personal.droid.pychat.models.Chat.class);
        modelClasses.add(personal.droid.pychat.models.MyString.class);
        modelClasses.add(personal.droid.pychat.models.LogCall.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(7);
        infoMap.put(personal.droid.pychat.models.Message.class, io.realm.personal_droid_pychat_models_MessageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(personal.droid.pychat.models.User.class, io.realm.personal_droid_pychat_models_UserRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(personal.droid.pychat.models.Group.class, io.realm.personal_droid_pychat_models_GroupRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(personal.droid.pychat.models.Attachment.class, io.realm.personal_droid_pychat_models_AttachmentRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(personal.droid.pychat.models.Chat.class, io.realm.personal_droid_pychat_models_ChatRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(personal.droid.pychat.models.MyString.class, io.realm.personal_droid_pychat_models_MyStringRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(personal.droid.pychat.models.LogCall.class, io.realm.personal_droid_pychat_models_LogCallRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(personal.droid.pychat.models.Message.class)) {
            return io.realm.personal_droid_pychat_models_MessageRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(personal.droid.pychat.models.User.class)) {
            return io.realm.personal_droid_pychat_models_UserRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(personal.droid.pychat.models.Group.class)) {
            return io.realm.personal_droid_pychat_models_GroupRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
            return io.realm.personal_droid_pychat_models_AttachmentRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
            return io.realm.personal_droid_pychat_models_ChatRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
            return io.realm.personal_droid_pychat_models_MyStringRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
            return io.realm.personal_droid_pychat_models_LogCallRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(personal.droid.pychat.models.Message.class)) {
            return "Message";
        }
        if (clazz.equals(personal.droid.pychat.models.User.class)) {
            return "User";
        }
        if (clazz.equals(personal.droid.pychat.models.Group.class)) {
            return "Group";
        }
        if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
            return "Attachment";
        }
        if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
            return "Chat";
        }
        if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
            return "MyString";
        }
        if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
            return "LogCall";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(personal.droid.pychat.models.Message.class)) {
                return clazz.cast(new io.realm.personal_droid_pychat_models_MessageRealmProxy());
            }
            if (clazz.equals(personal.droid.pychat.models.User.class)) {
                return clazz.cast(new io.realm.personal_droid_pychat_models_UserRealmProxy());
            }
            if (clazz.equals(personal.droid.pychat.models.Group.class)) {
                return clazz.cast(new io.realm.personal_droid_pychat_models_GroupRealmProxy());
            }
            if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
                return clazz.cast(new io.realm.personal_droid_pychat_models_AttachmentRealmProxy());
            }
            if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
                return clazz.cast(new io.realm.personal_droid_pychat_models_ChatRealmProxy());
            }
            if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
                return clazz.cast(new io.realm.personal_droid_pychat_models_MyStringRealmProxy());
            }
            if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
                return clazz.cast(new io.realm.personal_droid_pychat_models_LogCallRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(personal.droid.pychat.models.Message.class)) {
            personal_droid_pychat_models_MessageRealmProxy.MessageColumnInfo columnInfo = (personal_droid_pychat_models_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.Message.class);
            return clazz.cast(io.realm.personal_droid_pychat_models_MessageRealmProxy.copyOrUpdate(realm, columnInfo, (personal.droid.pychat.models.Message) obj, update, cache, flags));
        }
        if (clazz.equals(personal.droid.pychat.models.User.class)) {
            personal_droid_pychat_models_UserRealmProxy.UserColumnInfo columnInfo = (personal_droid_pychat_models_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.User.class);
            return clazz.cast(io.realm.personal_droid_pychat_models_UserRealmProxy.copyOrUpdate(realm, columnInfo, (personal.droid.pychat.models.User) obj, update, cache, flags));
        }
        if (clazz.equals(personal.droid.pychat.models.Group.class)) {
            personal_droid_pychat_models_GroupRealmProxy.GroupColumnInfo columnInfo = (personal_droid_pychat_models_GroupRealmProxy.GroupColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.Group.class);
            return clazz.cast(io.realm.personal_droid_pychat_models_GroupRealmProxy.copyOrUpdate(realm, columnInfo, (personal.droid.pychat.models.Group) obj, update, cache, flags));
        }
        if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
            personal_droid_pychat_models_AttachmentRealmProxy.AttachmentColumnInfo columnInfo = (personal_droid_pychat_models_AttachmentRealmProxy.AttachmentColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.Attachment.class);
            return clazz.cast(io.realm.personal_droid_pychat_models_AttachmentRealmProxy.copyOrUpdate(realm, columnInfo, (personal.droid.pychat.models.Attachment) obj, update, cache, flags));
        }
        if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
            personal_droid_pychat_models_ChatRealmProxy.ChatColumnInfo columnInfo = (personal_droid_pychat_models_ChatRealmProxy.ChatColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.Chat.class);
            return clazz.cast(io.realm.personal_droid_pychat_models_ChatRealmProxy.copyOrUpdate(realm, columnInfo, (personal.droid.pychat.models.Chat) obj, update, cache, flags));
        }
        if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
            personal_droid_pychat_models_MyStringRealmProxy.MyStringColumnInfo columnInfo = (personal_droid_pychat_models_MyStringRealmProxy.MyStringColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.MyString.class);
            return clazz.cast(io.realm.personal_droid_pychat_models_MyStringRealmProxy.copyOrUpdate(realm, columnInfo, (personal.droid.pychat.models.MyString) obj, update, cache, flags));
        }
        if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
            personal_droid_pychat_models_LogCallRealmProxy.LogCallColumnInfo columnInfo = (personal_droid_pychat_models_LogCallRealmProxy.LogCallColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.LogCall.class);
            return clazz.cast(io.realm.personal_droid_pychat_models_LogCallRealmProxy.copyOrUpdate(realm, columnInfo, (personal.droid.pychat.models.LogCall) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(personal.droid.pychat.models.Message.class)) {
            io.realm.personal_droid_pychat_models_MessageRealmProxy.insert(realm, (personal.droid.pychat.models.Message) object, cache);
        } else if (clazz.equals(personal.droid.pychat.models.User.class)) {
            io.realm.personal_droid_pychat_models_UserRealmProxy.insert(realm, (personal.droid.pychat.models.User) object, cache);
        } else if (clazz.equals(personal.droid.pychat.models.Group.class)) {
            io.realm.personal_droid_pychat_models_GroupRealmProxy.insert(realm, (personal.droid.pychat.models.Group) object, cache);
        } else if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
            io.realm.personal_droid_pychat_models_AttachmentRealmProxy.insert(realm, (personal.droid.pychat.models.Attachment) object, cache);
        } else if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
            io.realm.personal_droid_pychat_models_ChatRealmProxy.insert(realm, (personal.droid.pychat.models.Chat) object, cache);
        } else if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
            io.realm.personal_droid_pychat_models_MyStringRealmProxy.insert(realm, (personal.droid.pychat.models.MyString) object, cache);
        } else if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
            io.realm.personal_droid_pychat_models_LogCallRealmProxy.insert(realm, (personal.droid.pychat.models.LogCall) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(personal.droid.pychat.models.Message.class)) {
                io.realm.personal_droid_pychat_models_MessageRealmProxy.insert(realm, (personal.droid.pychat.models.Message) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.User.class)) {
                io.realm.personal_droid_pychat_models_UserRealmProxy.insert(realm, (personal.droid.pychat.models.User) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.Group.class)) {
                io.realm.personal_droid_pychat_models_GroupRealmProxy.insert(realm, (personal.droid.pychat.models.Group) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
                io.realm.personal_droid_pychat_models_AttachmentRealmProxy.insert(realm, (personal.droid.pychat.models.Attachment) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
                io.realm.personal_droid_pychat_models_ChatRealmProxy.insert(realm, (personal.droid.pychat.models.Chat) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
                io.realm.personal_droid_pychat_models_MyStringRealmProxy.insert(realm, (personal.droid.pychat.models.MyString) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
                io.realm.personal_droid_pychat_models_LogCallRealmProxy.insert(realm, (personal.droid.pychat.models.LogCall) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(personal.droid.pychat.models.Message.class)) {
                    io.realm.personal_droid_pychat_models_MessageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.User.class)) {
                    io.realm.personal_droid_pychat_models_UserRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.Group.class)) {
                    io.realm.personal_droid_pychat_models_GroupRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
                    io.realm.personal_droid_pychat_models_AttachmentRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
                    io.realm.personal_droid_pychat_models_ChatRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
                    io.realm.personal_droid_pychat_models_MyStringRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
                    io.realm.personal_droid_pychat_models_LogCallRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(personal.droid.pychat.models.Message.class)) {
            io.realm.personal_droid_pychat_models_MessageRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.Message) obj, cache);
        } else if (clazz.equals(personal.droid.pychat.models.User.class)) {
            io.realm.personal_droid_pychat_models_UserRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.User) obj, cache);
        } else if (clazz.equals(personal.droid.pychat.models.Group.class)) {
            io.realm.personal_droid_pychat_models_GroupRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.Group) obj, cache);
        } else if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
            io.realm.personal_droid_pychat_models_AttachmentRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.Attachment) obj, cache);
        } else if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
            io.realm.personal_droid_pychat_models_ChatRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.Chat) obj, cache);
        } else if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
            io.realm.personal_droid_pychat_models_MyStringRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.MyString) obj, cache);
        } else if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
            io.realm.personal_droid_pychat_models_LogCallRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.LogCall) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(personal.droid.pychat.models.Message.class)) {
                io.realm.personal_droid_pychat_models_MessageRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.Message) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.User.class)) {
                io.realm.personal_droid_pychat_models_UserRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.User) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.Group.class)) {
                io.realm.personal_droid_pychat_models_GroupRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.Group) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
                io.realm.personal_droid_pychat_models_AttachmentRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.Attachment) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
                io.realm.personal_droid_pychat_models_ChatRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.Chat) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
                io.realm.personal_droid_pychat_models_MyStringRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.MyString) object, cache);
            } else if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
                io.realm.personal_droid_pychat_models_LogCallRealmProxy.insertOrUpdate(realm, (personal.droid.pychat.models.LogCall) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(personal.droid.pychat.models.Message.class)) {
                    io.realm.personal_droid_pychat_models_MessageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.User.class)) {
                    io.realm.personal_droid_pychat_models_UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.Group.class)) {
                    io.realm.personal_droid_pychat_models_GroupRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
                    io.realm.personal_droid_pychat_models_AttachmentRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
                    io.realm.personal_droid_pychat_models_ChatRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
                    io.realm.personal_droid_pychat_models_MyStringRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
                    io.realm.personal_droid_pychat_models_LogCallRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(personal.droid.pychat.models.Message.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_MessageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(personal.droid.pychat.models.User.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(personal.droid.pychat.models.Group.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_GroupRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_AttachmentRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_ChatRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_MyStringRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_LogCallRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(personal.droid.pychat.models.Message.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_MessageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(personal.droid.pychat.models.User.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(personal.droid.pychat.models.Group.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_GroupRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_AttachmentRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_ChatRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_MyStringRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_LogCallRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(personal.droid.pychat.models.Message.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_MessageRealmProxy.createDetachedCopy((personal.droid.pychat.models.Message) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(personal.droid.pychat.models.User.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_UserRealmProxy.createDetachedCopy((personal.droid.pychat.models.User) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(personal.droid.pychat.models.Group.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_GroupRealmProxy.createDetachedCopy((personal.droid.pychat.models.Group) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(personal.droid.pychat.models.Attachment.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_AttachmentRealmProxy.createDetachedCopy((personal.droid.pychat.models.Attachment) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(personal.droid.pychat.models.Chat.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_ChatRealmProxy.createDetachedCopy((personal.droid.pychat.models.Chat) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(personal.droid.pychat.models.MyString.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_MyStringRealmProxy.createDetachedCopy((personal.droid.pychat.models.MyString) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(personal.droid.pychat.models.LogCall.class)) {
            return clazz.cast(io.realm.personal_droid_pychat_models_LogCallRealmProxy.createDetachedCopy((personal.droid.pychat.models.LogCall) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}

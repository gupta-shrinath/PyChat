package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class personal_droid_pychat_models_LogCallRealmProxy extends personal.droid.pychat.models.LogCall
    implements RealmObjectProxy, personal_droid_pychat_models_LogCallRealmProxyInterface {

    static final class LogCallColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long timeUpdatedIndex;
        long timeDurationSecondsIndex;
        long statusIndex;
        long myIdIndex;
        long userIdIndex;
        long userNameIndex;
        long userImageIndex;
        long userStatusIndex;
        long isVideoIndex;

        LogCallColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("LogCall");
            this.timeUpdatedIndex = addColumnDetails("timeUpdated", "timeUpdated", objectSchemaInfo);
            this.timeDurationSecondsIndex = addColumnDetails("timeDurationSeconds", "timeDurationSeconds", objectSchemaInfo);
            this.statusIndex = addColumnDetails("status", "status", objectSchemaInfo);
            this.myIdIndex = addColumnDetails("myId", "myId", objectSchemaInfo);
            this.userIdIndex = addColumnDetails("userId", "userId", objectSchemaInfo);
            this.userNameIndex = addColumnDetails("userName", "userName", objectSchemaInfo);
            this.userImageIndex = addColumnDetails("userImage", "userImage", objectSchemaInfo);
            this.userStatusIndex = addColumnDetails("userStatus", "userStatus", objectSchemaInfo);
            this.isVideoIndex = addColumnDetails("isVideo", "isVideo", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        LogCallColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new LogCallColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final LogCallColumnInfo src = (LogCallColumnInfo) rawSrc;
            final LogCallColumnInfo dst = (LogCallColumnInfo) rawDst;
            dst.timeUpdatedIndex = src.timeUpdatedIndex;
            dst.timeDurationSecondsIndex = src.timeDurationSecondsIndex;
            dst.statusIndex = src.statusIndex;
            dst.myIdIndex = src.myIdIndex;
            dst.userIdIndex = src.userIdIndex;
            dst.userNameIndex = src.userNameIndex;
            dst.userImageIndex = src.userImageIndex;
            dst.userStatusIndex = src.userStatusIndex;
            dst.isVideoIndex = src.isVideoIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private LogCallColumnInfo columnInfo;
    private ProxyState<personal.droid.pychat.models.LogCall> proxyState;

    personal_droid_pychat_models_LogCallRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (LogCallColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<personal.droid.pychat.models.LogCall>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$timeUpdated() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timeUpdatedIndex);
    }

    @Override
    public void realmSet$timeUpdated(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timeUpdatedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timeUpdatedIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$timeDurationSeconds() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.timeDurationSecondsIndex);
    }

    @Override
    public void realmSet$timeDurationSeconds(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timeDurationSecondsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timeDurationSecondsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusIndex);
    }

    @Override
    public void realmSet$status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.statusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.statusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.statusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$myId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.myIdIndex);
    }

    @Override
    public void realmSet$myId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.myIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.myIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.myIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.myIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIdIndex);
    }

    @Override
    public void realmSet$userId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userNameIndex);
    }

    @Override
    public void realmSet$userName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userImageIndex);
    }

    @Override
    public void realmSet$userImage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userImageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userImageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userImageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userImageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userStatus() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userStatusIndex);
    }

    @Override
    public void realmSet$userStatus(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userStatusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userStatusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userStatusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userStatusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isVideo() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isVideoIndex);
    }

    @Override
    public void realmSet$isVideo(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isVideoIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isVideoIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("LogCall", 9, 0);
        builder.addPersistedProperty("timeUpdated", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("timeDurationSeconds", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("myId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userImage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userStatus", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isVideo", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static LogCallColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new LogCallColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "LogCall";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "LogCall";
    }

    @SuppressWarnings("cast")
    public static personal.droid.pychat.models.LogCall createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        personal.droid.pychat.models.LogCall obj = realm.createObjectInternal(personal.droid.pychat.models.LogCall.class, true, excludeFields);

        final personal_droid_pychat_models_LogCallRealmProxyInterface objProxy = (personal_droid_pychat_models_LogCallRealmProxyInterface) obj;
        if (json.has("timeUpdated")) {
            if (json.isNull("timeUpdated")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeUpdated' to null.");
            } else {
                objProxy.realmSet$timeUpdated((long) json.getLong("timeUpdated"));
            }
        }
        if (json.has("timeDurationSeconds")) {
            if (json.isNull("timeDurationSeconds")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeDurationSeconds' to null.");
            } else {
                objProxy.realmSet$timeDurationSeconds((int) json.getInt("timeDurationSeconds"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
            }
        }
        if (json.has("myId")) {
            if (json.isNull("myId")) {
                objProxy.realmSet$myId(null);
            } else {
                objProxy.realmSet$myId((String) json.getString("myId"));
            }
        }
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                objProxy.realmSet$userId(null);
            } else {
                objProxy.realmSet$userId((String) json.getString("userId"));
            }
        }
        if (json.has("userName")) {
            if (json.isNull("userName")) {
                objProxy.realmSet$userName(null);
            } else {
                objProxy.realmSet$userName((String) json.getString("userName"));
            }
        }
        if (json.has("userImage")) {
            if (json.isNull("userImage")) {
                objProxy.realmSet$userImage(null);
            } else {
                objProxy.realmSet$userImage((String) json.getString("userImage"));
            }
        }
        if (json.has("userStatus")) {
            if (json.isNull("userStatus")) {
                objProxy.realmSet$userStatus(null);
            } else {
                objProxy.realmSet$userStatus((String) json.getString("userStatus"));
            }
        }
        if (json.has("isVideo")) {
            if (json.isNull("isVideo")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isVideo' to null.");
            } else {
                objProxy.realmSet$isVideo((boolean) json.getBoolean("isVideo"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static personal.droid.pychat.models.LogCall createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final personal.droid.pychat.models.LogCall obj = new personal.droid.pychat.models.LogCall();
        final personal_droid_pychat_models_LogCallRealmProxyInterface objProxy = (personal_droid_pychat_models_LogCallRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("timeUpdated")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeUpdated((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeUpdated' to null.");
                }
            } else if (name.equals("timeDurationSeconds")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeDurationSeconds((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeDurationSeconds' to null.");
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
                }
            } else if (name.equals("myId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$myId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$myId(null);
                }
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
            } else if (name.equals("userName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userName(null);
                }
            } else if (name.equals("userImage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userImage((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userImage(null);
                }
            } else if (name.equals("userStatus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userStatus((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userStatus(null);
                }
            } else if (name.equals("isVideo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isVideo((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isVideo' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static personal_droid_pychat_models_LogCallRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(personal.droid.pychat.models.LogCall.class), false, Collections.<String>emptyList());
        io.realm.personal_droid_pychat_models_LogCallRealmProxy obj = new io.realm.personal_droid_pychat_models_LogCallRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static personal.droid.pychat.models.LogCall copyOrUpdate(Realm realm, LogCallColumnInfo columnInfo, personal.droid.pychat.models.LogCall object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (personal.droid.pychat.models.LogCall) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static personal.droid.pychat.models.LogCall copy(Realm realm, LogCallColumnInfo columnInfo, personal.droid.pychat.models.LogCall newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (personal.droid.pychat.models.LogCall) cachedRealmObject;
        }

        personal_droid_pychat_models_LogCallRealmProxyInterface realmObjectSource = (personal_droid_pychat_models_LogCallRealmProxyInterface) newObject;

        Table table = realm.getTable(personal.droid.pychat.models.LogCall.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.timeUpdatedIndex, realmObjectSource.realmGet$timeUpdated());
        builder.addInteger(columnInfo.timeDurationSecondsIndex, realmObjectSource.realmGet$timeDurationSeconds());
        builder.addString(columnInfo.statusIndex, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.myIdIndex, realmObjectSource.realmGet$myId());
        builder.addString(columnInfo.userIdIndex, realmObjectSource.realmGet$userId());
        builder.addString(columnInfo.userNameIndex, realmObjectSource.realmGet$userName());
        builder.addString(columnInfo.userImageIndex, realmObjectSource.realmGet$userImage());
        builder.addString(columnInfo.userStatusIndex, realmObjectSource.realmGet$userStatus());
        builder.addBoolean(columnInfo.isVideoIndex, realmObjectSource.realmGet$isVideo());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.personal_droid_pychat_models_LogCallRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, personal.droid.pychat.models.LogCall object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(personal.droid.pychat.models.LogCall.class);
        long tableNativePtr = table.getNativePtr();
        LogCallColumnInfo columnInfo = (LogCallColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.LogCall.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$timeUpdated(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeDurationSecondsIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$timeDurationSeconds(), false);
        String realmGet$status = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        }
        String realmGet$myId = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$myId();
        if (realmGet$myId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
        }
        String realmGet$userId = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        }
        String realmGet$userName = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userName();
        if (realmGet$userName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
        }
        String realmGet$userImage = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userImage();
        if (realmGet$userImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
        }
        String realmGet$userStatus = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userStatus();
        if (realmGet$userStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userStatusIndex, rowIndex, realmGet$userStatus, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$isVideo(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(personal.droid.pychat.models.LogCall.class);
        long tableNativePtr = table.getNativePtr();
        LogCallColumnInfo columnInfo = (LogCallColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.LogCall.class);
        personal.droid.pychat.models.LogCall object = null;
        while (objects.hasNext()) {
            object = (personal.droid.pychat.models.LogCall) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$timeUpdated(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeDurationSecondsIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$timeDurationSeconds(), false);
            String realmGet$status = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            }
            String realmGet$myId = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$myId();
            if (realmGet$myId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
            }
            String realmGet$userId = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            }
            String realmGet$userName = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userName();
            if (realmGet$userName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
            }
            String realmGet$userImage = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userImage();
            if (realmGet$userImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
            }
            String realmGet$userStatus = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userStatus();
            if (realmGet$userStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userStatusIndex, rowIndex, realmGet$userStatus, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$isVideo(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, personal.droid.pychat.models.LogCall object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(personal.droid.pychat.models.LogCall.class);
        long tableNativePtr = table.getNativePtr();
        LogCallColumnInfo columnInfo = (LogCallColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.LogCall.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$timeUpdated(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeDurationSecondsIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$timeDurationSeconds(), false);
        String realmGet$status = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
        }
        String realmGet$myId = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$myId();
        if (realmGet$myId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.myIdIndex, rowIndex, false);
        }
        String realmGet$userId = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
        }
        String realmGet$userName = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userName();
        if (realmGet$userName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userNameIndex, rowIndex, false);
        }
        String realmGet$userImage = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userImage();
        if (realmGet$userImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userImageIndex, rowIndex, false);
        }
        String realmGet$userStatus = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userStatus();
        if (realmGet$userStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userStatusIndex, rowIndex, realmGet$userStatus, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userStatusIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$isVideo(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(personal.droid.pychat.models.LogCall.class);
        long tableNativePtr = table.getNativePtr();
        LogCallColumnInfo columnInfo = (LogCallColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.LogCall.class);
        personal.droid.pychat.models.LogCall object = null;
        while (objects.hasNext()) {
            object = (personal.droid.pychat.models.LogCall) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$timeUpdated(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeDurationSecondsIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$timeDurationSeconds(), false);
            String realmGet$status = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
            }
            String realmGet$myId = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$myId();
            if (realmGet$myId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.myIdIndex, rowIndex, false);
            }
            String realmGet$userId = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
            }
            String realmGet$userName = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userName();
            if (realmGet$userName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userNameIndex, rowIndex, false);
            }
            String realmGet$userImage = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userImage();
            if (realmGet$userImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userImageIndex, rowIndex, false);
            }
            String realmGet$userStatus = ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$userStatus();
            if (realmGet$userStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userStatusIndex, rowIndex, realmGet$userStatus, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userStatusIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoIndex, rowIndex, ((personal_droid_pychat_models_LogCallRealmProxyInterface) object).realmGet$isVideo(), false);
        }
    }

    public static personal.droid.pychat.models.LogCall createDetachedCopy(personal.droid.pychat.models.LogCall realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        personal.droid.pychat.models.LogCall unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new personal.droid.pychat.models.LogCall();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (personal.droid.pychat.models.LogCall) cachedObject.object;
            }
            unmanagedObject = (personal.droid.pychat.models.LogCall) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        personal_droid_pychat_models_LogCallRealmProxyInterface unmanagedCopy = (personal_droid_pychat_models_LogCallRealmProxyInterface) unmanagedObject;
        personal_droid_pychat_models_LogCallRealmProxyInterface realmSource = (personal_droid_pychat_models_LogCallRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$timeUpdated(realmSource.realmGet$timeUpdated());
        unmanagedCopy.realmSet$timeDurationSeconds(realmSource.realmGet$timeDurationSeconds());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());
        unmanagedCopy.realmSet$myId(realmSource.realmGet$myId());
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$userName(realmSource.realmGet$userName());
        unmanagedCopy.realmSet$userImage(realmSource.realmGet$userImage());
        unmanagedCopy.realmSet$userStatus(realmSource.realmGet$userStatus());
        unmanagedCopy.realmSet$isVideo(realmSource.realmGet$isVideo());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("LogCall = proxy[");
        stringBuilder.append("{timeUpdated:");
        stringBuilder.append(realmGet$timeUpdated());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeDurationSeconds:");
        stringBuilder.append(realmGet$timeDurationSeconds());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status() != null ? realmGet$status() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{myId:");
        stringBuilder.append(realmGet$myId() != null ? realmGet$myId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userName:");
        stringBuilder.append(realmGet$userName() != null ? realmGet$userName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userImage:");
        stringBuilder.append(realmGet$userImage() != null ? realmGet$userImage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userStatus:");
        stringBuilder.append(realmGet$userStatus() != null ? realmGet$userStatus() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isVideo:");
        stringBuilder.append(realmGet$isVideo());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        personal_droid_pychat_models_LogCallRealmProxy aLogCall = (personal_droid_pychat_models_LogCallRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aLogCall.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aLogCall.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aLogCall.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}

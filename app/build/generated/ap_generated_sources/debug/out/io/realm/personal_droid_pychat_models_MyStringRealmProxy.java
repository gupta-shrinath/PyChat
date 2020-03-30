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
public class personal_droid_pychat_models_MyStringRealmProxy extends personal.droid.pychat.models.MyString
    implements RealmObjectProxy, personal_droid_pychat_models_MyStringRealmProxyInterface {

    static final class MyStringColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long stringIndex;

        MyStringColumnInfo(OsSchemaInfo schemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MyString");
            this.stringIndex = addColumnDetails("string", "string", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        MyStringColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MyStringColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MyStringColumnInfo src = (MyStringColumnInfo) rawSrc;
            final MyStringColumnInfo dst = (MyStringColumnInfo) rawDst;
            dst.stringIndex = src.stringIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MyStringColumnInfo columnInfo;
    private ProxyState<personal.droid.pychat.models.MyString> proxyState;

    personal_droid_pychat_models_MyStringRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MyStringColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<personal.droid.pychat.models.MyString>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$string() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.stringIndex);
    }

    @Override
    public void realmSet$string(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.stringIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.stringIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.stringIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.stringIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MyString", 1, 0);
        builder.addPersistedProperty("string", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MyStringColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MyStringColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MyString";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MyString";
    }

    @SuppressWarnings("cast")
    public static personal.droid.pychat.models.MyString createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        personal.droid.pychat.models.MyString obj = realm.createObjectInternal(personal.droid.pychat.models.MyString.class, true, excludeFields);

        final personal_droid_pychat_models_MyStringRealmProxyInterface objProxy = (personal_droid_pychat_models_MyStringRealmProxyInterface) obj;
        if (json.has("string")) {
            if (json.isNull("string")) {
                objProxy.realmSet$string(null);
            } else {
                objProxy.realmSet$string((String) json.getString("string"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static personal.droid.pychat.models.MyString createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final personal.droid.pychat.models.MyString obj = new personal.droid.pychat.models.MyString();
        final personal_droid_pychat_models_MyStringRealmProxyInterface objProxy = (personal_droid_pychat_models_MyStringRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("string")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$string((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$string(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static personal_droid_pychat_models_MyStringRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(personal.droid.pychat.models.MyString.class), false, Collections.<String>emptyList());
        io.realm.personal_droid_pychat_models_MyStringRealmProxy obj = new io.realm.personal_droid_pychat_models_MyStringRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static personal.droid.pychat.models.MyString copyOrUpdate(Realm realm, MyStringColumnInfo columnInfo, personal.droid.pychat.models.MyString object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (personal.droid.pychat.models.MyString) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static personal.droid.pychat.models.MyString copy(Realm realm, MyStringColumnInfo columnInfo, personal.droid.pychat.models.MyString newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (personal.droid.pychat.models.MyString) cachedRealmObject;
        }

        personal_droid_pychat_models_MyStringRealmProxyInterface realmObjectSource = (personal_droid_pychat_models_MyStringRealmProxyInterface) newObject;

        Table table = realm.getTable(personal.droid.pychat.models.MyString.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.stringIndex, realmObjectSource.realmGet$string());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.personal_droid_pychat_models_MyStringRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, personal.droid.pychat.models.MyString object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(personal.droid.pychat.models.MyString.class);
        long tableNativePtr = table.getNativePtr();
        MyStringColumnInfo columnInfo = (MyStringColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.MyString.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$string = ((personal_droid_pychat_models_MyStringRealmProxyInterface) object).realmGet$string();
        if (realmGet$string != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.stringIndex, rowIndex, realmGet$string, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(personal.droid.pychat.models.MyString.class);
        long tableNativePtr = table.getNativePtr();
        MyStringColumnInfo columnInfo = (MyStringColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.MyString.class);
        personal.droid.pychat.models.MyString object = null;
        while (objects.hasNext()) {
            object = (personal.droid.pychat.models.MyString) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$string = ((personal_droid_pychat_models_MyStringRealmProxyInterface) object).realmGet$string();
            if (realmGet$string != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.stringIndex, rowIndex, realmGet$string, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, personal.droid.pychat.models.MyString object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(personal.droid.pychat.models.MyString.class);
        long tableNativePtr = table.getNativePtr();
        MyStringColumnInfo columnInfo = (MyStringColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.MyString.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$string = ((personal_droid_pychat_models_MyStringRealmProxyInterface) object).realmGet$string();
        if (realmGet$string != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.stringIndex, rowIndex, realmGet$string, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.stringIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(personal.droid.pychat.models.MyString.class);
        long tableNativePtr = table.getNativePtr();
        MyStringColumnInfo columnInfo = (MyStringColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.MyString.class);
        personal.droid.pychat.models.MyString object = null;
        while (objects.hasNext()) {
            object = (personal.droid.pychat.models.MyString) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$string = ((personal_droid_pychat_models_MyStringRealmProxyInterface) object).realmGet$string();
            if (realmGet$string != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.stringIndex, rowIndex, realmGet$string, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.stringIndex, rowIndex, false);
            }
        }
    }

    public static personal.droid.pychat.models.MyString createDetachedCopy(personal.droid.pychat.models.MyString realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        personal.droid.pychat.models.MyString unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new personal.droid.pychat.models.MyString();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (personal.droid.pychat.models.MyString) cachedObject.object;
            }
            unmanagedObject = (personal.droid.pychat.models.MyString) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        personal_droid_pychat_models_MyStringRealmProxyInterface unmanagedCopy = (personal_droid_pychat_models_MyStringRealmProxyInterface) unmanagedObject;
        personal_droid_pychat_models_MyStringRealmProxyInterface realmSource = (personal_droid_pychat_models_MyStringRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$string(realmSource.realmGet$string());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MyString = proxy[");
        stringBuilder.append("{string:");
        stringBuilder.append(realmGet$string() != null ? realmGet$string() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

}

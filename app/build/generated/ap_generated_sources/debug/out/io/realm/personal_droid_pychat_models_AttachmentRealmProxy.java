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
public class personal_droid_pychat_models_AttachmentRealmProxy extends personal.droid.pychat.models.Attachment
    implements RealmObjectProxy, personal_droid_pychat_models_AttachmentRealmProxyInterface {

    static final class AttachmentColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long nameIndex;
        long dataIndex;
        long urlIndex;
        long bytesCountIndex;

        AttachmentColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Attachment");
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.dataIndex = addColumnDetails("data", "data", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.bytesCountIndex = addColumnDetails("bytesCount", "bytesCount", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        AttachmentColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AttachmentColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AttachmentColumnInfo src = (AttachmentColumnInfo) rawSrc;
            final AttachmentColumnInfo dst = (AttachmentColumnInfo) rawDst;
            dst.nameIndex = src.nameIndex;
            dst.dataIndex = src.dataIndex;
            dst.urlIndex = src.urlIndex;
            dst.bytesCountIndex = src.bytesCountIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private AttachmentColumnInfo columnInfo;
    private ProxyState<personal.droid.pychat.models.Attachment> proxyState;

    personal_droid_pychat_models_AttachmentRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AttachmentColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<personal.droid.pychat.models.Attachment>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$data() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dataIndex);
    }

    @Override
    public void realmSet$data(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dataIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dataIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dataIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dataIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$url() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.urlIndex);
    }

    @Override
    public void realmSet$url(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.urlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.urlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.urlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.urlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$bytesCount() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.bytesCountIndex);
    }

    @Override
    public void realmSet$bytesCount(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.bytesCountIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.bytesCountIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Attachment", 4, 0);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("data", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("url", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("bytesCount", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AttachmentColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new AttachmentColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Attachment";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Attachment";
    }

    @SuppressWarnings("cast")
    public static personal.droid.pychat.models.Attachment createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        personal.droid.pychat.models.Attachment obj = realm.createObjectInternal(personal.droid.pychat.models.Attachment.class, true, excludeFields);

        final personal_droid_pychat_models_AttachmentRealmProxyInterface objProxy = (personal_droid_pychat_models_AttachmentRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("data")) {
            if (json.isNull("data")) {
                objProxy.realmSet$data(null);
            } else {
                objProxy.realmSet$data((String) json.getString("data"));
            }
        }
        if (json.has("url")) {
            if (json.isNull("url")) {
                objProxy.realmSet$url(null);
            } else {
                objProxy.realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("bytesCount")) {
            if (json.isNull("bytesCount")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'bytesCount' to null.");
            } else {
                objProxy.realmSet$bytesCount((long) json.getLong("bytesCount"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static personal.droid.pychat.models.Attachment createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final personal.droid.pychat.models.Attachment obj = new personal.droid.pychat.models.Attachment();
        final personal_droid_pychat_models_AttachmentRealmProxyInterface objProxy = (personal_droid_pychat_models_AttachmentRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("data")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$data((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$data(null);
                }
            } else if (name.equals("url")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$url((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$url(null);
                }
            } else if (name.equals("bytesCount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bytesCount((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'bytesCount' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static personal_droid_pychat_models_AttachmentRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(personal.droid.pychat.models.Attachment.class), false, Collections.<String>emptyList());
        io.realm.personal_droid_pychat_models_AttachmentRealmProxy obj = new io.realm.personal_droid_pychat_models_AttachmentRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static personal.droid.pychat.models.Attachment copyOrUpdate(Realm realm, AttachmentColumnInfo columnInfo, personal.droid.pychat.models.Attachment object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (personal.droid.pychat.models.Attachment) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static personal.droid.pychat.models.Attachment copy(Realm realm, AttachmentColumnInfo columnInfo, personal.droid.pychat.models.Attachment newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (personal.droid.pychat.models.Attachment) cachedRealmObject;
        }

        personal_droid_pychat_models_AttachmentRealmProxyInterface realmObjectSource = (personal_droid_pychat_models_AttachmentRealmProxyInterface) newObject;

        Table table = realm.getTable(personal.droid.pychat.models.Attachment.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.dataIndex, realmObjectSource.realmGet$data());
        builder.addString(columnInfo.urlIndex, realmObjectSource.realmGet$url());
        builder.addInteger(columnInfo.bytesCountIndex, realmObjectSource.realmGet$bytesCount());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.personal_droid_pychat_models_AttachmentRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, personal.droid.pychat.models.Attachment object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(personal.droid.pychat.models.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.Attachment.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$name = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$data = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$data();
        if (realmGet$data != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
        }
        String realmGet$url = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$bytesCount(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(personal.droid.pychat.models.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.Attachment.class);
        personal.droid.pychat.models.Attachment object = null;
        while (objects.hasNext()) {
            object = (personal.droid.pychat.models.Attachment) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$name = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$data = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$data();
            if (realmGet$data != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
            }
            String realmGet$url = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$bytesCount(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, personal.droid.pychat.models.Attachment object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(personal.droid.pychat.models.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.Attachment.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$name = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$data = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$data();
        if (realmGet$data != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dataIndex, rowIndex, false);
        }
        String realmGet$url = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$bytesCount(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(personal.droid.pychat.models.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(personal.droid.pychat.models.Attachment.class);
        personal.droid.pychat.models.Attachment object = null;
        while (objects.hasNext()) {
            object = (personal.droid.pychat.models.Attachment) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$name = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$data = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$data();
            if (realmGet$data != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dataIndex, rowIndex, false);
            }
            String realmGet$url = ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((personal_droid_pychat_models_AttachmentRealmProxyInterface) object).realmGet$bytesCount(), false);
        }
    }

    public static personal.droid.pychat.models.Attachment createDetachedCopy(personal.droid.pychat.models.Attachment realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        personal.droid.pychat.models.Attachment unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new personal.droid.pychat.models.Attachment();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (personal.droid.pychat.models.Attachment) cachedObject.object;
            }
            unmanagedObject = (personal.droid.pychat.models.Attachment) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        personal_droid_pychat_models_AttachmentRealmProxyInterface unmanagedCopy = (personal_droid_pychat_models_AttachmentRealmProxyInterface) unmanagedObject;
        personal_droid_pychat_models_AttachmentRealmProxyInterface realmSource = (personal_droid_pychat_models_AttachmentRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$data(realmSource.realmGet$data());
        unmanagedCopy.realmSet$url(realmSource.realmGet$url());
        unmanagedCopy.realmSet$bytesCount(realmSource.realmGet$bytesCount());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Attachment = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{data:");
        stringBuilder.append(realmGet$data() != null ? realmGet$data() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url() != null ? realmGet$url() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bytesCount:");
        stringBuilder.append(realmGet$bytesCount());
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
        personal_droid_pychat_models_AttachmentRealmProxy aAttachment = (personal_droid_pychat_models_AttachmentRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAttachment.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAttachment.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAttachment.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}

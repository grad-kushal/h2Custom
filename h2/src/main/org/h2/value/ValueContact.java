package org.h2.value;

import org.h2.util.StringUtils;

/**
 * Implementation of the PASSWORD data type.
 */
public class ValueContact extends ValueStringBase {

    private ValueContact(String v) {
        super(v);
    }

    /**
     * Appends the SQL statement of this object to the specified builder.
     *
     * @param builder  string builder
     * @param sqlFlags formatting flags
     * @return the specified string builder
     */
    @Override
    public StringBuilder getSQL(StringBuilder builder, int sqlFlags) {
        return StringUtils.quoteStringSQL(builder, value);
    }

    /**
     * Get the value type.
     *
     * @return the value type
     */
    @Override
    public int getValueType() {
        return CONTACT;
    }
}

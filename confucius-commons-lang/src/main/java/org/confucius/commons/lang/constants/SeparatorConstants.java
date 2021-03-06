/**
 *
 */
package org.confucius.commons.lang.constants;

import org.apache.commons.lang3.SystemUtils;

/**
 * Separator Constants
 * <p/>
 * Some separators can be referenced from {@link SystemUtils}
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy<a/>
 * @version 1.0.0
 * @see SystemUtils#FILE_SEPARATOR
 * @since 1.0.0
 */
public interface SeparatorConstants {

    /**
     * Exclamation : "!"
     */
    String EXCLAMATION = "!";

    /**
     * Archive Entity Separator : "!/"
     */
    String ARCHIVE_ENTITY = EXCLAMATION + PathConstants.SLASH;

    /**
     * Query String Separator : "?"
     */
    String QUERY_STRING = "?";

}

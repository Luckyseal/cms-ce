/*
 * Copyright 2000-2013 Enonic AS
 * http://www.enonic.com/license
 */

package com.enonic.cms.api.client.model;

/**
 * This class implements parameters for getContentBinary.
 */
public final class GetContentBinaryParams
    extends AbstractParams
{
    private static final long serialVersionUID = 8835663063064609797L;

    public int contentKey = -1;

    public String label = null;

    /**
     * Specifies if content that matches the search, but is offline, should be included in the result set.
     * Default is false.
     */
    public boolean includeOfflineContent = false;

}

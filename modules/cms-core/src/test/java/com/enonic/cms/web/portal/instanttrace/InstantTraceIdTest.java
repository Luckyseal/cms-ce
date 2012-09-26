package com.enonic.cms.web.portal.instanttrace;

import org.junit.Test;

import com.enonic.cms.core.security.user.UserKey;

import static org.junit.Assert.*;

public class InstantTraceIdTest
{

    @Test
    public void constructor_with_string()
    {
        InstantTraceId instantTraceId = new InstantTraceId( "ABC:1" );
        assertEquals( new UserKey( "ABC" ), instantTraceId.getUser() );
        assertEquals( new Long( 1 ), instantTraceId.getTraceCompletedNumber() );
    }

    @Test
    public void tostring()
    {
        InstantTraceId instantTraceId = new InstantTraceId( new UserKey( "ABC" ), (long) 1 );
        assertEquals( "ABC:1", instantTraceId.toString() );
    }
}

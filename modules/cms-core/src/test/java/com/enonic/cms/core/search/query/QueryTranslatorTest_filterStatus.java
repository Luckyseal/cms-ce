package com.enonic.cms.core.search.query;

import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;

import com.enonic.cms.core.content.ContentStatus;
import com.enonic.cms.core.content.index.ContentIndexQuery;
import com.enonic.cms.core.search.query.factory.FilterQueryBuilderFactory;

public class QueryTranslatorTest_filterStatus
    extends QueryTranslatorBaseTest
{
    FilterQueryBuilderFactory filterQueryBuilderFactory = new FilterQueryBuilderFactory();

    @Test
    public void testStatusFilter()
    {
        String expected = "{\n" +
            "  \"filter\" : {\n" +
            "    \"term\" : {\n" +
            "      \"status\" : \"2\"\n" +
            "    }\n" +
            "  }\n" +
            "}";

        SearchSourceBuilder builder = new SearchSourceBuilder();

        ContentIndexQuery query = new ContentIndexQuery( "" );

        query.setContentStatusFilter( ContentStatus.APPROVED.getKey() );

        filterQueryBuilderFactory.buildFilterQuery( builder, query );

        compareStringsIgnoreFormatting( expected, builder.toString() );
    }


}
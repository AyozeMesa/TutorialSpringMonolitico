package com.ccsw.tutorial.author.model;

import com.ccsw.tutorial.common.pagination.PageableRequest;

/**
 * 
 * @author amesanun
 *
 */
public class AuthorSearchDto {

    private PageableRequest pageable;

    public PageableRequest getPageable() {
        return pageable;
    }

    public void setPageable(PageableRequest pageable) {
        this.pageable = pageable;
    }

}

/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.mas.body.acts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.drools.mas.body.content.Info;

/*
 * The action of asking another agent whether or not a given proposition is true.
 * The agent performing the query-if act:
 * · has no knowledge of the truth value of the proposition, and,
 * · believes that the other agent can inform the querying agent if it knows the truth of the proposition.
 */

@XmlType(name = "QueryIf", namespace = "http://acts.body.mas.drools.org/")
@XmlAccessorType(XmlAccessType.FIELD)
public class QueryIf extends AbstractMessageBody {

    
    @XmlElement(required = true)
    private Info proposition;
    
    public QueryIf() {
    }

    public QueryIf(Info proposition) {
        this.proposition = proposition;
    }

   
    @Override
    public String toString() {
        return "QueryIf{"
                + "proposition=" + proposition
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        QueryIf that = (QueryIf) o;

        if (proposition != null ? !proposition.equals(that.proposition) : that.proposition != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return proposition != null ? proposition.hashCode() : 0;
    }

    public Info getProposition() {
        return proposition;
    }

    public void setProposition(Info proposition) {
        this.proposition = proposition;
    }

    public Object[] getArguments() {
        return new Object[]{proposition.getData()};
    }
}

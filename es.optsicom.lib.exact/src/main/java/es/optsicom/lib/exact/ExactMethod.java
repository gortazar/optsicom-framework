/* ******************************************************************************
 * 
 * This file is part of Optsicom
 * 
 * License:
 *   EPL: http://www.eclipse.org/legal/epl-v10.html
 *   LGPL 3.0: http://www.gnu.org/licenses/lgpl-3.0-standalone.html
 *   See the LICENSE file in the project's top-level directory for details.
 *
 * **************************************************************************** */
package es.optsicom.lib.exact;

import es.optsicom.lib.Instance;

import es.optsicom.lib.Method;
import es.optsicom.lib.Solution;

public interface ExactMethod<S extends Solution<I>, I extends Instance> extends Method<S,I> {

	public ExactResult<S> execute(I instance) throws ExactException;

	public abstract ExactResult<S> execute(I instance, long timeLimit);
	
}

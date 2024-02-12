class Solution {
    public String simplifyPath(String path) {
        Deque<String> deque = new ArrayDeque<>();

        // Split input string by '/'
        String[] segments = path.split("/");

        for (String segment : segments) {
            if (segment.equals("..")) {
                if (!deque.isEmpty()) {
                    deque.pollLast(); // Equivalent to pop() for a Deque
                }
            } else if (!segment.equals("") && !segment.equals(".")) {
                deque.offerLast(segment); // Equivalent to push() for a Deque
            }
            // For segment.equals("."), do nothing (ignore)
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        while (!deque.isEmpty()) {
            result.append("/").append(deque.pollFirst());
        }

        return result.length() > 0 ? result.toString() : "/";
    }
}
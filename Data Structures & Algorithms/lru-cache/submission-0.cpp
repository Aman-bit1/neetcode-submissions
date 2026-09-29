class LRUCache {
public:

    struct Node {
        Node* next;
        Node* prev;
        int key;
        int value;

        Node(int k, int v) {
            key = k;
            value = v;
            next = nullptr;
            prev = nullptr;
        }
    };

    int capacity;
    Node* head;
    Node* tail;

    unordered_map<int, Node*> mp;

    LRUCache(int capacity) {

        this->capacity = capacity;

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head->next = tail;
        tail->prev = head;
    }

    void remove(Node* node) {

        Node* prevnode = node->prev;
        Node* nextnode = node->next;

        prevnode->next = nextnode;
        nextnode->prev = prevnode;
    }

    void insertatend(Node* node) {

        Node* prevnode = tail->prev;

        prevnode->next = node;
        node->prev = prevnode;

        node->next = tail;
        tail->prev = node;
    }

    int get(int key) {

        if (mp.find(key) == mp.end()) {
            return -1;
        }

        Node* node = mp[key];

        // Make this node most recently used
        remove(node);
        insertatend(node);

        return node->value;
    }

    void put(int key, int value) {

        // Key already exists
        if (mp.find(key) != mp.end()) {

            Node* node = mp[key];

            node->value = value;

            // Put it at MRU position
            remove(node);
            insertatend(node);

            return;
        }

        // Key does not exist
        Node* node = new Node(key, value);

        mp[key] = node;

        // New node becomes MRU
        insertatend(node);

        // Capacity exceeded
        if (mp.size() > capacity) {

            // First real node = LRU
            Node* lru = head->next;

            remove(lru);

            mp.erase(lru->key);

            delete lru;
        }
    }
};